

document.getElementById('btn').addEventListener('click', login)

async function login(){
    // to let my api validate login information I need to attach the username and password to the http request
    let loginInfo = {
    username: document.getElementById("Username").value,
    password: document.getElementById("Password").value
    }

    // now that I have the login information I need to convert it into a JSON
    let loginJSON = JSON.stringify(loginInfo);

    // now I can set up my HTTP request configurations
    let config = {
        method:"PATCH", // method is a reference to the kind of request you are making (the verb): GET is the default
        headers:{'Content-Type':"application/json"}, // some APIs will return an error message without this value included
        body: loginJSON
    }

    let httpResponse = await fetch("https://bugcatcher.coe.revaturelabs.com/13/login",config); // make sure to enter the url assigned to you
    
    if(httpResponse.status===200){
        let responseBody=await httpResponse.json();

        if(responseBody.username==='TesterOne'){
            window.location.href='Testerpage.html'
        }else if(responseBody.username==='TesterTwo'){
            window.location.href='testerpagetwo.html'
        }else if(responseBody.username==='TesterThree'){
            window.location.href='testerpagethree.html'
        }else{
            window.location.href='managerpage.html'
        }
    } else{
        let responseBody=await httpResponse.json();
        alert(responseBody.detail)

    }

    
}

