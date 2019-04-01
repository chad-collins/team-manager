import React, { Component } from 'react';
import PropTypes from 'prop-types';
import Division from '../divisions/Division';
import UpdateConferenceName from './UpdateConferenceName';
import AddDivision from '../divisions/AddDivision';

export class Conference extends Component {
  getStyle = () => {
    return {
      background: '#d0d0d0',
      padding: '10px',
      borderBottom: '1px #ccc dotted',
    }
  }



  render() {
    const { conferenceName, divisions, conferenceId } = this.props.conference;

        return (
            <div  style={this.getStyle()}>
                <h2>{ conferenceName }</h2>
                <UpdateConferenceName updateConferenceName={this.props.updateConferenceName} conferenceId={ conferenceId } />
                <AddDivision addDivision={this.props.addDivision} conference={this.props.conference}/>
                {
                    divisions.map((division) => {
                        return (
                            <Division
                                key={division.divisionId}
                                division={division}
                                delTeam={ this.props.delTeam}
                                addTeam={this.props.addTeam}
                                updateConferenceName={this.props.updateConferenceName}
                            />
                        )
                    })
                }
            </div>
        )
    }

  }

// PropTypes
Conference.propTypes = {
  conference: PropTypes.object.isRequired,

}


export default Conference
