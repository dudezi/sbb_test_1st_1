# sbb_test_1st_1
## 1차 요구사항 구현
- [x] 유저가 루트 url로 접속시에 게시글 리스트 페이지(http://주소:포트/article/list)가 나온다.
- [x] 리스트 페이지에서는 등록 버튼이 있고 버튼을 누르면 http://주소:포트/article/create 경로로 이동하고 등록 폼이 나온다.
- [ ] 게시글 등록을 하면 http://주소:포트/article/create로 POST 요청을 보내어 DB에 해당 내용을 저장한다.
- [ ] 게시글 등록이 되면 해당 게시글 리스트 페이지로 리다이렉트 된다. 페이지 URL 은 http://주소:포트/article/list 이다.
- [ ] 리스트 페이지에서 해당 게시글을 클릭하면 상세페이지로 이동한다. 해당 경로는 http://주소:포트/article/detail/{id} 가 된다.
- [ ] 게시글 상세 페이지에는 id에 맞는 게시글 데이터와 목록 버튼이 있다. 목록 버튼을 누르면 게시글 리스트 페이지로 이동하게 된다.

- (추가 기능이나 구현기능설명이 필요한 경우 서술)

## 미비사항 or 막힌 부분
1. DB 연결
- DB 명 부분 오류라고 나와 DB 명 찾는다고 계속 헤매고 db명을 대충(db명이 문제가 안되는건지 이것도 문제였는지 이해못함.) 해결.
- 그 후 @Entity에 세부 테이블도 전혀 설정하지 않아 추가로 오류가 발생, 이것이 없으면 연결이 안된다는 것을 깨달았습니다.
- db명을 mysql로 연결해두었다가 아무리 진행해도 database로 추가되거나 반영되는것이 없어 DBeaver에서 직접 test_1st_1 데이터베이스를 생성하고 연결하니 article이 나왔습니다.
2. interface 생성
- (아무 생각없이 생성하다 막혔습니다. 한 번 막히니 시야가 좁아져 계속 못찾다가 겨우 찾아서 생성했습니다.)
3. 데이터 추가
- 책에서 나오는 데로 해본다고 했다가 한 후, 안되었을때 Service 추가하니 되었습니다.
4. 등록부분
- 등록에 대한 이해가 좋지 못해서 어떤 방식으로 해야했나, 생각해내는데 시간이 좀 걸렸습니다.
5. 

## MVC 패턴
- ...

## 스프링에서 의존성 주입(DI) 방법 3가지 방법
- ...

## JPA의 장점과 단점
- ...

## HTTP GET 요청과 POST 요청의 차이
- ...