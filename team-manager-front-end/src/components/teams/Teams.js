import React, { Component } from 'react'
import Team from './Team';
import PropTypes from 'prop-types';

export class Teams extends Component {
    render() {
        return this.props.teams.map((team) => (
            <Team key={team.teamId} 
            team={team} />
        ));
    }
}

// PropTypes
Teams.propTypes = {
    teams: PropTypes.array.isRequired,
}

export default Teams
