## 웹 서버 띄우기

```python
> pip install flask
> flask --version


# [app.py 파일생성후 templates 폴더생성후 form.html 생성] 

from flask import Flask, render_template, jsonify

app = Flask(__name__)
app.config['JSON_AS_ASCII'] = False

@app.route('/')
def index():
    data = {'name' : 'jin'}
    return jsonify(data)

@app.route('/form')
def form():
    return render_template('form.html')
```