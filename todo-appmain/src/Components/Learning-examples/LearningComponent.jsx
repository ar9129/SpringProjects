import FirstComponent from './FirstComponent'
import SecondComponent from './SecondComponent'
import ThirdComponent from './ThirdComponent'
// import ForthComponent  from './ThirdComponent';  -- while importing a normal export, we need to put into braces, see next Line
import {ForthComponent}  from './ThirdComponent';
import LearningJavascript  from './LearningJavascript';

export default function LearningComponent() {
    return (
   
      <div className= "App">
  
        My Todo Application
  
        <FirstComponent></FirstComponent>
        <SecondComponent/>
        <ThirdComponent></ThirdComponent>
        <ForthComponent/>
        <LearningJavascript/>

      </div>
     
  
    );
  }
  