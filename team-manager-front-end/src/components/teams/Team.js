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
        <h4>{ teamName } { teamLogo } { location } </h4>
      </div>
    )
  }
}

// PropTypes
Team.propTypes = {
  team: PropTypes.object.isRequired,

}


export default Team