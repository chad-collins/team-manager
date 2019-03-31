import React, { Component } from 'react';
import PropTypes from 'prop-types';
import Division from '../divisions/Division';

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
                <button onClick={this.props.delConference.bind(this, conferenceId)}>x</button>
                {
                    divisions.map((division) => {
                        return (
                            <Division
                                key={division.divisionId} 
                                division={division}
                                delTeam={ this.props.delTeam}
                                addTeam={this.props.addTeam}
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