import React, {Component} from 'react';
import 'semantic-ui-css/semantic.min.css';
import Items from './Items/Items.js';
import Head from './Head/Head.js';
import Nav from './Nav/Nav.js';
import About from './About/About.js';
import Help from './Help/Help.js';
import User  from './User/User.js';
import {Router, Route} from 'react-router';
import axios from 'axios';

import createBrowserHistory from 'history/createBrowserHistory';

const history = createBrowserHistory();

//Importer les difeerents components qu'on a créé
//délcarer la classe de notre site
class Site extends Component {
	componentDidMount () {
       //ce qu'on recoit de sprint cote serveur
       axios.get('http://localhost:8080/utilisateurs')
       //promesse,then: la fonction s'execute si tout va bien
       .then(function (data){
            console.log('///------------------///');
            console.log(data);
            console.log('///------------------///');
       })
       .catch(function (err){
            console.log('///------------------///');
            console.log(err);
            console.log('///------------------///');
       })

   }

	render(){
		return(
		
			<Router history={history}>
				<div>
					<Route path="/" component={Head} />
					<Route path="/" component={Nav} />
					<Route path="/home" component={About} />
					<Route path="/gallery" component={Items} />
					<Route path="/Help" component={Help} />
					<Route path="/User" Component={User} />
				</div>
			</Router>
			
			);
	}


}
export default Site;