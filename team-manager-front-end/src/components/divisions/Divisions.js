import React, { Component } from 'react'
import Division from './Division';
import PropTypes from 'prop-types';

export class Divisions extends Component {
    render() {
        return this.props.divisions.map((division) => (
            <Division key={division.divisionId} 
            division={division} />
        ));
    }
}

// PropTypes
Divisions.propTypes = {
    divisions: PropTypes.array.isRequired,
}

export default Divisions
