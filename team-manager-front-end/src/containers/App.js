import React, { Component } from 'react';
import './App.css';
import Conferences from '../components/conferences/Conferences';
import Team from '../components/teams/Team';
class App extends Component {

  constructor() {
    super()
    this.state = {
      conferences: [],
    }
  }

  componentDidMount() {
    this.getConferences()
  }

  delConference(id){
    console.log(id)
    fetch(`/conferences/delete/${id}`,
      {
        method: 'delete'
      }
    )
      .then(res => res.json())
      .then(data => {
        this.setState({conferences: data})
      })
      .catch(err => console.log(err))
  }

  delTeam(id){
    console.log(id)
    fetch(`/teams/delete/${id}`,
      {
        method: 'delete'
      }
    )
      .then(res => res.json())
      .then(data => {
        this.setState({conferences: data})
      })
      .then(window.location.reload())
      .catch(err => console.log(err))
  }


  getConferences = () => {
    fetch('/conferences')
      .then(res => res.json())
      .then(data => {
        this.setState({conferences: data})
      })
      .catch(err => console.log(err))
  }



  render() {
    return (
      <div className="App">
        <Conferences conferences={this.state.conferences} delConference={this.delConference} delTeam={this.delTeam} />
      </div>
    );
  }
}

export default App;
