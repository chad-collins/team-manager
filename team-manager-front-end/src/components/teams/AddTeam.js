import React, { Component } from 'react'

export class AddTeam extends Component {

state = {
  teamName: "",
  teamLogo : "",
  location : "",
}


  getStyle = () => {
    return {
      flex: '10', 
      padding: '5px'
    }
}

    onSubmit = (event) => {
        event.preventDefault()
        this.props.addTeam(this.props.division.divisionId, this.state)
        console.log(this.props.division)
        this.setState({ teamName :"", teamLogo :"", location :"" })
    }

    onChange = (event) => this.setState({ [event.target.name]: event.target.value })

  render() {
      return (
        <form onSubmit={this.onSubmit} style={{display: 'flex'}}>
          <input type="text" name="teamName" placeholder="New Team's Name ..." value={this.state.teamName} onChange={this.onChange} style={this.getStyle()} />
          <input type="text" name="teamLogo" placeholder="New Team's Logo ..." value={this.state.teamLogo} onChange={this.onChange} style={this.getStyle()} />
          <input type="text" name="location" placeholder="New Team's Stadium Location ..." value={this.state.location} onChange={this.onChange} style={this.getStyle()} />
          <input type="submit" value="Submit" className="btn" style={{flex: '1'}} />
        </form>
      )
  }
}

export default AddTeam
