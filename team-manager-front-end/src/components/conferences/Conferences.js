import React, { Component } from 'react'
import Conference from './Conference';
import PropTypes from 'prop-types';

export class Conferences extends Component {
    render() {
        return this.props.conferences.map((conference) => (
            <Conference key={conference.conferenceId}
            conference={conference} delConference={ this.props.delConference  }  delTeam={ this.props.delTeam} addTeam={this.props.addTeam} updateConferenceName={this.props.updateConferenceName}
            addDivision={this.props.addDivision} />
        ));
    }
}

// PropTypes
Conferences.propTypes = {
    conferences: PropTypes.array.isRequired,

}

export default Conferences
