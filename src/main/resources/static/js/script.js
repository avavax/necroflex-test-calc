const calcForm = document.querySelector('#calc-form')
if (calcForm) {
    calcForm.addEventListener('submit', function(e) {

        e.preventDefault()
        const formData = new FormData(calcForm)

        const answerContainer = document.querySelector('#answer-container')
        const first = calcForm.querySelector('input[name="first"]').value
        const second = calcForm.querySelector('input[name="second"]').value
        const select = calcForm.querySelector('select[name="operand"]')
        const operand = select.options[select.selectedIndex].text;

        fetch ('/', {
            method: 'POST',
            body: formData
        })
            .then(response => response.json())
            .then(data => {

                console.log(data)

                const fullAnswer = `<tr>
                            <td>${first + " " + operand + " " + second}</td>
                            <td>${data.result ? data.result : "Server or data error"}</td>
                        </tr>`

                answerContainer.insertAdjacentHTML('afterbegin', fullAnswer)
                //this.reset()
            })
    })
}