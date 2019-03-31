import React, { Component } from 'react'

export class AddDivision extends Component {

state = {
  divisionName : "",
  conference : "",

}


    onSubmit = (event) => {
        event.preventDefault()
        this.props.addDivision(this.props.conference.conferenceId, this.state)
        console.log(this.props.conference)
        this.setState({ divisionName : "", conference :"" })
    }

    onChange = (event) => this.setState({ [event.target.name]: event.target.value })

  render() {
      return (
        <form onSubmit={this.onSubmit} style={{display: 'flex'}}>
          <input type="text" name="divisionName" placeholder="division name" value={this.state.divisionName} onChange={this.onChange} style={{flex: '10', padding: '5px'}} />
  

          <input type="submit" value="Submit" className="btn" style={{flex: '1'}} />
        </form>
      )
  }
}

export default AddDivision
