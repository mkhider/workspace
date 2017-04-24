

import React ,{Component} from 'react';

//const myVar = 'Hello !';
class Test extends Component {
	constructor (props){

		super(props);

		this.state ={
		greeting : 'Hello',
		increment : 0,
		date : new Date()
		
		
		};
	}
		
	
		componentDidMount() {
			this.timer = setInterval(this.tick,1000);
							
		}
	

		tick = () => {
			let newTime=this.state.increment+10;
			console.log(' Test');
			this.setState ({
			increment : newTime,
			date : new Date()
		});	
		
	}

	render(){

				
		return (
			<div className="Test">
			{this.state.greeting} {this.props.quoi}!
			{this.state.increment}
		</div>

	
		
		
		);
	}
}
export default Test;