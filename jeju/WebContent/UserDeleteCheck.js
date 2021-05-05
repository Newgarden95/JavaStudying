/**
 * 회원정보 수정 및 삭제 페이지에서 회원탈퇴 버튼 클릭시 확인 
 */

function DeleteCheck() {
	const result = confirm('회원탈퇴를 진행하시겠습니까?')
	
	if (result) {
		alert('회원탈퇴가 완료되었습니다.')
	}else {
		alert('회원탈퇴를 취소하였습니다.')
	}
}