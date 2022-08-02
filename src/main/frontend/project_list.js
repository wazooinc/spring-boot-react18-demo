import React from 'react';
import Project from './project';

const ProjectList = ({projects}) => {
    return (
        <>
            { projects.map((project) => (
                <Project key={project.id}
                         id={project.id}
                         name={project.name}
                         description={project.description}>
                </Project>
           ))}
        </>
    )

};

export default ProjectList;
