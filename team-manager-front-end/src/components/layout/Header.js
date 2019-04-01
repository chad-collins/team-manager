import React from 'react'

function Header() {
    return (
        <header style={headerStyle}>
            <h1>FANTASY TEAM MANAGER</h1>
        </header>
    )
}

const headerStyle = {
    background: '#4571b7',
    color: '#fff',
    display: 'flex',
    alignItems: 'center',
    justifyContent: 'center',
    height: '20vh',
    textAlign: 'center',
    padding: '10px'
}

export default Header