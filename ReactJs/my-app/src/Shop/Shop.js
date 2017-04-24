// dossier et un fichier js pour notre component
// import React et sa class component dans notre fichier 
// déclarer la classe de mon component
//définir sa methode render
//qui va return notre template Html
// exporter le compoent

import React, {Component} from 'react';
import Cart from './Cart/Cart.js';
import Product from './Product/Product.js';
import products from './products.json'
import './shop.css';

class Shop extends Component {
	constructor (props) {
		super(props);
		this.state = {
		cart: [],
		product: [],
		click: 0


		};

			
		}
		componentWillMount() {
			this.setState({
				products:products.datas
			});
		}
	
	
			addToCart=(productName,productPrice)=> {
			let newCart=this.state.cart;
			newCart.push({
			name:productName,
			price:productPrice,
		});
			this.setState({cart:newCart});
		}
		
	
	incrementClick=()=> {
		let newClick= this.state.click;
		newClick ++;
		this.setState({
		click: newClick
		});
		
	}
			consoleProductName=(productName)=> {
			let newProduct=this.state.product;
			newProduct.push(productName);
			this.setState({product:newProduct});
		}
	componentDidUpdate(){
		console.log(this.state.cart);
	}
	
	render () {

		return (

			<div className="shop">
				SHOP
				<Cart  cart={this.state.cart}/>
				{
					this.state.products.map(
					(product, i )=> <Product key={i} name={product.name} price={product.price}
					name={product.name} add={this.addToCart} increment={this.incrementClick}/>

						)
					}
			</div>


			);
	}
}


export default Shop;