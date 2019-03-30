import React, { Component } from 'react';
import PropTypes from 'prop-types';

export class Conference extends Component {
  getStyle = () => {
    return {
      background: '#f4f4f4',
      padding: '10px',
      borderBottom: '1px #ccc dotted',
    }
  }

  render() {
    const { conferenceId, conferenceName, divisions } = this.props.conference;
    return (
      <div style={this.getStyle()}>
        <h2>{ conferenceName }</h2>
        
      </div>
    )
  }
}

// PropTypes
Conference.propTypes = {
  conference: PropTypes.object.isRequired,

}


export default Conference