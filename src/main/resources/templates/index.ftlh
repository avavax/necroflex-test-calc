<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calculator</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.7.2/font/bootstrap-icons.css">
</head>
<body>
<main class="main-content">
    <div class="container">
        <h1 class="text-left display-6 fw-bold mb-5 mt-5">Калькулятор</h1>

        <form method="post" action="/" id="calc-form">
            <div class="row">
                <div class="col-md-2">
                    <input type="text" placeholder="первое" name="first" class="form-control">
                </div>
                <div class="col-md-1">
                    <select class="form-select" name="operand">
                        <option value="add">+</option>
                        <option value="subtract">-</option>
                        <option value="multiply">*</option>
                        <option value="divide">/</option>
                    </select>
                </div>
                <div class="col-md-2">
                    <input type="text" placeholder="второе" name="second" class="form-control">
                </div>
                <div class="col-md-2">
                    <input type="submit" value="Вычислить" class="form-control btn-success">
                </div>
                <div class="col-md-2">
                    <a href="/" class="btn btn-warning form-control">Очистить</a>
                </div>
            </div>
        </form>
        <div class="result-table mt-5">
            <div class="row">
                <div class="col-md-7">
                    <table class="table">
                        <thead>
                        <tr>
                            <th scope="col">Пример</th>
                            <th scope="col">Результат</th>
                        </tr>
                        </thead>
                        <tbody id="answer-container">
                        </tbody>
                    </table>
                </div>
            </div>

        </div>
    </div>
</main>
<script src="/js/script.js"></script>
</body>
</html>