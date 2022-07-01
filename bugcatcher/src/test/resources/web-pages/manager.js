let defect= document.getElementById('defect')
let options = document.getElementById('options')
let text= document.getElementById('text')
let pageTwoInfo = document.getElementById('accept')
let update = document.getElementById('update')
let accept = document.getElementById('accept')

document.getElementById('click').addEventListener('click', assign)
  async function assign(){
        let decfectInfo ={
            "assignedTo": options.value,
            "dateReported": 0,
            "desc": defect.value,
            "stepsToReproduce": "string",
            "severity": "Low",
            "priority": "Low"
          }

          let decfectInfoJSON = JSON.stringify(decfectInfo);

          let config={
            method:"POST",
            headers:{'Content-Type':"application/json"},
            body: decfectInfoJSON
          }
          
        let httpResponse = await fetch("https://bugcatcher.coe.revaturelabs.com/13/defects",config);
        let responseBody = await httpResponse.json();

        console.log(responseBody)

        if(responseBody.assignedTo==='TesterOne'){
            text.textContent = responseBody.defectId
            accept.textContent=responseBody.assignedTo
            alert(defect.value + ' has been assigned to ' + options.value)
            localStorage.setItem('1', responseBody.defectId)
        }else if(responseBody.assignedTo==='TesterTwo'){
            text.textContent = responseBody.desc
            accept.textContent=responseBody.assignedTo
            alert(defect.value + ' has been assigned to ' + options.value)
            localStorage.setItem('2', responseBody.defectId )
        }else{
            text.textContent=responseBody.desc
            accept.text=responseBody.assignedTo
            alert(defect.value + ' has been assigned to ' + options.value)
            localStorage.setItem('3', responseBody.defectId)
        }
    
    }
