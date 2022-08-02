import React from 'react';

const Project = ({id, name, description}) => {
    return (
        <>
            <tr>
                <td>{id}</td>
                <td>{name}</td>
                <td>{description}</td>
            </tr>
        </>
    )
};

export default Project;
