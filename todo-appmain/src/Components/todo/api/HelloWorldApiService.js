import axios from "axios";

const apiClient = axios.create(
    {
    baseURL:'http://localhost:8080'
    }
);

export const retrieveHelloWorldBean= ()=>{
    return axios.get('http://localhost:8080/hello-world');
}

export const retrieveHelloWorldPathVariable= (username)=>{
    return axios.get(`http://localhost:8080/hello-world/path-variable/${username}`);
}

