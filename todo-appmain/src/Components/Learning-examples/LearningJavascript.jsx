const person= {
    name: 'Manish',
    address: {
        line1: 'Champasari',
        State: 'West Bengal',
        Country: 'India'

    },
    Age: 25,
    profiles: ['Instagram', 'Twitter', 'LinkedIn'],
    
}


export default function LearningJavascript(){
    return (


        <div>
           <div>{person.name}</div>
           <div>{person.address.line1}</div>
           <div>{person.address.State}</div>
           <div>{person.address.Country}</div>
           <div>{person.profiles[0]}</div>
           <div>{person.profiles[1]}</div>
        

        </div>

    )
}