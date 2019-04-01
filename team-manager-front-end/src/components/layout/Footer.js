import React from 'react'

function Footer() {
    return (
        <footer style={ footerStyle } >
            <h3>Authors:</h3>
            <ul>
                <li><a href="https://github.com/rewkie" target="_blank">Chad Collins</a></li>
                <li><a href="https://github.com/jsunh98" target="_blank">Jason Hochheiser</a></li>
            </ul>
        </footer>
    )
}

const footerStyle = {
    background: '#4571b7',
    color: '#fff',
    textAlign: 'center',
    padding: '10px'
}


export default Footer