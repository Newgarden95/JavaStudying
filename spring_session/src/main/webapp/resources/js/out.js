//동적으로 처리할 기능을 정리하면 됨

//기능 정의 => function(함수), 메서드
function add(a, b) {
	sum = a + b
	alert('최종 지불 금액을 더하는 처리 ' + sum)
	return sum//리턴값
}
function minus(c) {
	if(c>=500){
		c = c - 100;
	}else{
		alert(c + '원 최종 지불 금액을 뺴주는 처리')
	}
	
}
//JS내장형객체(미리 만들어둔 객체~> new할 필요x) window, location, document, history
//window: alert(), confirm(), input(), parseint()
//location: location.href
//document: document.write()
//history: history.go()