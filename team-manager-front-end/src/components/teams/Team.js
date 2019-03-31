import React, { Component } from 'react';
import PropTypes from 'prop-types';


export class Team extends Component {
  getStyle = () => {
    return {
      background: '#f4f4f4',
      padding: '10px',
      borderBottom: '1px #ccc dotted',
    }
  }

  render() {
    const { teamId, teamName, teamLogo, location } = this.props.team;
    return (
      <div style={this.getStyle()}>
      <button onClick={this.props.delTeam.bind(this, teamId)} style={{float: 'right'}}>x</button>
        <img src={ teamLogo } style={{height: '25px'}}></img>
        <h4>{ teamName } { location } </h4>
      </div>
    )
  }
}

// PropTypes
Team.propTypes = {
  team: PropTypes.object.isRequired,

}


export default Team