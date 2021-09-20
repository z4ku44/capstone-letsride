import axios from "axios";

export const getToken = credentials =>
    axios
        .post('auth/access_token', credentials)
        .then(response => response.data)
        .then(dto => dto.token)

const headers = token => ({
    headers: {
        Authorization: `Bearer ${token}`,
    },
})

export const getUsers = () =>
    axios
        .get('api/getUsers')
        .then(response => response.data)

export const getUser = () =>
    axios
        .get('api/getUser/user1')
        .then(response => response.data)

export const createUser = newUser =>
    axios
        .post('api/registerUser', newUser)
        .then(response => response.data)

export const deleteUser = (token) =>
    axios
        .delete('api/deleteUser', headers(token))
        .then(response => response.data)



