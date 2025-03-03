import './Home.css';
import organic from './images/Organic.jpg';

function Home() {

  return (
    
    <div className='home'>
      <div className='image'>
    <img src={organic} alt=""></img>
      </div>
    <div className='content'>
      <p>Health is Wealth </p>
  <p> Eat Natural Eat Organic </p>
    </div>
  </div>
  );
}

export default Home;