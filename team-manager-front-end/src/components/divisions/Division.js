import React, { Component } from 'react';
import PropTypes from 'prop-types';
import Team from '../teams/Team'

export class Division extends Component {
    getStyle = () => {
        return {
            background: '#e0e0e0',
            padding: '10px',
            borderBottom: '1px #ccc dotted',
        }
    }

    render() {
        const { divisionName, teams } = this.props.division;
        
        return (
            <div style={this.getStyle()}>
                <h3>{ divisionName }</h3>
                <div>
                {
                    teams.map((team) => {
                        return (
                            <Team 
                                key={team.teamId} 
                                team={team}
                                delTeam={ this.props.delTeam}
                            />
                        )
                    }) 
                }
                </div>                 
            </div>
        )   
    }
}

// PropTypes
Division.propTypes = {
    division: PropTypes.object.isRequired,

}


export default Division