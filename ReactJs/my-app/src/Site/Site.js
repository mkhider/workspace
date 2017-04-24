import React, {Component} from 'react';
import 'semantic-ui-css/semantic.min.css';
import Items from './Items/Items.js';
import Head from './Head/Head.js';

//Importer les difeerents components qu'on a créé
//délcarer la classe de notre site
class Site extends Component {
	render() {
		return(
			<div>
			<Head />
			<Items />
			</div>
			)
	}
}
export default Site;