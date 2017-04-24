import React, {Component} from 'react';
import {Image, Segment, Header} from 'semantic-ui-react';
import landscape from './head.jpg';
class Head extends Component {
	render () {
		return(
			<div>
			<Image  src ={landscape}/>
			<Segment>
			<Header as ="h2" color="grey"> Mon blog </header>
			</Segment>
			</div>

			)
	}
}
export default Head;