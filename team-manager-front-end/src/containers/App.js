import React, { Component } from 'react';
import './App.css';
import Conferences from '../components/conferences/Conferences';

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
  
  addTeam = (id, state) => {
    fetch(`/teams/add/${id}`,{ method: 'POST', body : JSON.stringify(state) } 
    )
    .then(res => res.json())
      .then(data => {
        this.setState({conferences: data})
      })
      .then(window.location.reload())
      .catch(err => console.log(err))
  }


  delConference(id){
    
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

  updateConferenceName = (id, state) => {
    fetch(`/conferences/update/title/${id}`,{ method: 'POST', body : JSON.stringify(state) } 
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
        <Conferences conferences={this.state.conferences} delConference={this.delConference} delTeam={this.delTeam} addTeam={this.addTeam} updateConferenceName={this.updateConferenceName} />
      </div>
    );
  }
}

export default App;
