## react hooks

~~~
에러 : React Hook “useState” is called in a function “abc” which is neither a React function or a custom React Hook function.

검색 결과 : functional 컴포넌트는 *반드시* 대문자로 시작해야 한다.
           custom hook의 이름 또한 *반드시* 소문자인 “use”로 시작해야 한다.
           
해결 : const abc -> const Abc  대문자로 수정했다. 잘된다.



[ useState ]

const [selectedSubMenu, setSelectedSubMenu] = useState('ALL')

const onSubMenuClicked = (type) => { 
    setSelectedSubMenu(type)
    //console.log("type", type)
  }


<a
   id='tabLabell2'
   role='tab'
   onClick={ () => onSubMenuClicked('ALL')}
   aria-selected={selectedSubMenu === 'ALL'}
   >
   전체채널
</a>


~~~
