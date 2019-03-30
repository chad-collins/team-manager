// import React, { Component } from 'react';
// import PropTypes from 'prop-types';
// import api from '.../utils/api/api-actions';
//
//
//
// export class AddConference extends Component {
//   state = {
//     conferenceName: ''
//   }
//   api.postRequest('/conferences/add', {
//           conferenceName: conferenceName
//
//         // }, (conferences) => getAppContext().innerHTML = Conference(conferences))
//       }
//
//
//
//
//
//
//   onSubmit = (e) => {
//
//     e.preventDefault();
//
//     this.props.addConference(this.state.conferenceName);
//
//     this.setState({ conferenceName: '' });
//
//   }
//
//
//
//   onChange = (e) => this.setState({ [e.target.name]: e.target.value });
//
//
//
//   render() {
//
//     return (
//
//       <form onSubmit={this.onSubmit} style={{ display: 'flex' }}>
//
//         <input
//
//           type="text"
//
//           name="conference name"
//
//           style={{ flex: '10', padding: '5px' }}
//
//           placeholder="Add Conference ..."
//
//           value={this.state.conferenceName}
//
//           onChange={this.onChange}
//
//         />
//
//         <input
//
//           type="submit"
//
//           value="Submit"
//
//           className="btn"
//
//           style={{flex: '1'}}
//
//         />
//
//       </form>
//
//     )
// export default AddConference
