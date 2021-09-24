import {useHistory} from 'react-router-dom'
import {StyledSection} from "./StyledSection";
export default function MotoCard( { moto } ) {

    const history = useHistory();

    function selectMoto(id) {
        history.push(`myMotorcycle/${id}`)
    }
    return(
        <StyledSection onClick={()=>{selectMoto(moto.motoID)}}>
            <h4>Username: {moto.motoNickName}</h4>
            <p>Manufacturer: {moto.manufacturer}</p>
            <p>Lastname: {moto.model}</p>
            <p>Age: {moto.constructionYear}</p>
        </StyledSection>
    );
}