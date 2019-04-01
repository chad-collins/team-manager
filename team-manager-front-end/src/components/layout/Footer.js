import React from 'react'

function Footer() {
    return (
        <footer style={ footerStyle } >
            <h3>Authors:</h3>
            <ul>
                <li><a href="https://github.com/rewkie" target="_blank" style={ anchorStyle }>Chad Collins</a></li>
                <li><a href="https://github.com/jsunh98" target="_blank" style={ anchorStyle }>Jason Hochheiser</a></li>
            </ul>
        </footer>
    )
}

const footerStyle = {
    background: 'maroon',
    color: '#fff',
    textAlign: 'center',
    padding: '10px'
}

const anchorStyle = {
    color: 'white'
}

export default Footer