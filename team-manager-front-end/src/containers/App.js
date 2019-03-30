import React, { Component } from 'react';
import './App.css';
import Conferences from '../components/conferences/Conferences';
import AddConference from '../components/conferences/AddConference';
class App extends Component {

  constructor() {
    super()
    this.state = {
      conferences: [],
      // divisions: []
    }
  }

  componentDidMount() {
    this.getConferences()
    // this.getDivisions()
  }

  getConferences = () => {
    fetch('/conferences')
      .then(res => res.json())
      .then(data => {
        this.setState({conferences: data})
      })
      .catch(err => console.log(err))
  }

  // getDivisions = () => {
  //   fetch('/divisions')
  //     .then(res => res.json())
  //     .then(data => {
  //       this.setState({divisions: data})
  //     })
  //     .catch(err => console.log(err))
  //}



  render() {
    return (
      <div className="App">
        <AddConference />
        <Conferences conferences={this.state.conferences} />
      </div>
    );
  }
}

export default App;
