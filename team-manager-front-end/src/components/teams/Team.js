import React, { Component } from 'react';
import PropTypes from 'prop-types';


export class Team extends Component {
  
  divStyle = () => {
    return {
      background: '#f4f4f4',
      padding: '10px',
      borderBottom: '1px #ccc dotted',
      display: 'flex', 
      justifyContent: 'space-between'
    }
  }

  imgStyle = () => {
    return {
      height: '30px',
      width: 'Auto'
    }
  }

  render() {
    const { teamId, teamName, teamLogo, location } = this.props.team;
    return (
      <div style={this.divStyle()}>
        <img src={ teamLogo } style={this.imgStyle()}></img>
        <h4>{ teamName } { location } </h4>
      <button onClick={this.props.delTeam.bind(this, teamId)}>Delete Team</button>
      </div>
    )
  }
}

// PropTypes
Team.propTypes = {
  team: PropTypes.object.isRequired,

}


export default Team