import './style.css';
import React, {useEffect, useState} from 'react';
import ProjectList from './project_list';

const App = () => {
    const [projects, setProjects] = useState([]);

    useEffect(() => {
        fetch('api/projects')
            .then((response) => response.json())
            .then((data) => {
                setProjects(data);
                console.log(data);
            });
    }, []);

    return (
        <>
            <h1>Project List</h1>
            <table>
                <thead>
                    <tr><th>Id</th><th>Name</th><th>Description</th></tr>
                </thead>
                <tbody>
                    <ProjectList projects={projects} />
                </tbody>
            </table>
        </>
    )
};

export default App;

