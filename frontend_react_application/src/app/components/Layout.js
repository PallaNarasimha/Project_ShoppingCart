import { Outlet, Link } from "react-router-dom";
import '../styles/Layout.css';
import organicVegetable from '../images/organicvegetables.jpg';
const Layout = () => {
  return (
    <>
    <div className="header">
    <h1 className='title'> Shopping Organic Vegetables </h1>
    </div><br></br>
      <nav>
        <div className="align">
        <img src={organicVegetable} alt=""></img>
          <Link to="/">Home</Link>
          &ensp;
          &ensp;
          &ensp;
          <Link to="/Register">Register</Link>
          &ensp;
          &ensp;
          &ensp;
          <Link to="/Login">Login</Link>
          &ensp;
          &ensp;
          &ensp;
          <Link to="/Payment">Payment</Link>
          &ensp;
          &ensp;
          <Link to="/AboutUs">AboutUs</Link>
          &ensp;
          &ensp;
          &ensp;
          <Link to="/ContactUs">ContactUs</Link>
          &ensp;
        </div>
      </nav>
      <Outlet />
    </>
  )
};
export default Layout;