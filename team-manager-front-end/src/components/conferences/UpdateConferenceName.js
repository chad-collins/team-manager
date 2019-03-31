import React, { Component } from 'react'

export class UpdateConferenceName extends Component {
 
    state = {
        conferenceName : ""
    }
   
    onSubmit = (event) => {
        event.preventDefault()
        this.props.updateConferenceName(this.props.conferenceId, this.state)
        this.setState({ conferenceName: '' })
    }

    onChange = (event) => this.setState({ [event.target.name]: event.target.value })

  render() {
      return (
        <form onSubmit={this.onSubmit} style={{display: 'flex', flexWrap: 'wrap', maxWidth: '600px', width: '100%'}}>
          <input type="text" name="conferenceName" placeholder="Update Conference Name" value={this.state.conferenceName} onChange={this.onChange} style={{flex: '10', padding: '5px'}} />
          <input type="submit" value="Submit" className="btn" style={{flex: '1'}} />
        </form>
      ) 
  }
}

export default UpdateConferenceName
