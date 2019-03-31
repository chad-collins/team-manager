import React, { Component } from 'react'

export class AddTeam extends Component {

state = {
  teamName: "",
  teamLogo : "",
  location : "",
}


    onSubmit = (event) => {
        event.preventDefault()
        this.props.addTeam(this.props.division.divisionId, this.state)
        console.log(this.props.division)
        this.setState({ title: '', teamLogo :"", location :"", division :"" })
    }

    onChange = (event) => this.setState({ [event.target.name]: event.target.value })

  render() {
      return (
        <form onSubmit={this.onSubmit} style={{display: 'flex', flexWrap: 'wrap', maxWidth: '1000px', width: '100%'}}>
          <input type="text" name="teamName" placeholder="Team Name ..." value={this.state.teamName} onChange={this.onChange} style={{flex: '10', padding: '5px'}} />
          <input type="text" name="teamLogo" placeholder="Team Logo URL ..." value={this.state.teamLogo} onChange={this.onChange} style={{flex: '10', padding: '5px'}} />
          <input type="text" name="location" placeholder="Stadium Location ..." value={this.state.location} onChange={this.onChange} style={{flex: '10', padding: '5px'}} />
          <input type="submit" value="Submit" className="btn" style={{flex: '1'}} />
        </form>
      ) 
  }
}

export default AddTeam