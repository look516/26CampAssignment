# 26CampAssignment
2026년도 내일배움캠프 과제입니다.

## 과제 1: CRUD Code Shadowing
### GOAL: 비즈니스 로직 분리하기
    IDEA: Controller에서 Service를 분리하자

        miniorder/order
        miniorder/product

---
### 1회차
    260415 완료 (단순 따라치기)  
    문제점 - root 잘못된 네이밍, 비즈니스 로직 분리 X

### 2회차
    260419 완료 (단순 따라치기 + 프로젝트 구조 hotfix 상태)  
    문제점 - 중첩됨, 비즈니스 로직 분리 X
    해결방안 - Temp Code Refactoring, Controller에서 Service를 분리

### 3회차
    260422 완료 (모놀리틱 구조 + 단순 Service 분리)
    문제점 - OrderService에서 ProductRepository를 직접 참조한다
    해결방안 - Service끼리 호출하도록 Refactor
---

### GOAL+
    추후 모놀리틱 -> MSA로 refactoring 해보자.
    추후 검증 로직을 분리하는 등 더 고도화된 설계 방안을 생각해보자.
### Review
#### 과제에 생각보다 시간을 오래 쏟았다. 원인은 무엇이었을까?

    1. 폴더 구조와 패키지 구조를 혼동
    2. 모놀리틱 구조와 MSA 구조에 대한 이해 부족
    3. Order 도메인에 대한 이해 부족
    4. 접근 권한에 대한 개념 부족

루트 디렉토리 이름을 패키지 경로와 같은 이름으로 잘못 설정하여,  
구조가 헷갈리고 여러 개념이 섞어 이상한 곳에서 헤맸다...

<br>

    1-1.
    Directory: 물리적 주소
    Package: 클래스들을 묶는 단위
    
    패키지 구조와 폴더 구조는 보통 1:1로 매핑된다.
    ex) package com.sparta.miniorder.order; 인 파일은
    -> com/sparta/miniorder/order/ 에 위치

    1-2. 패키지를 쓰는 이유
    1. 같은 도메인/역할의 클래스들을 분류하기 용이
    2. 이름 충돌 방지 (재사용성을 높이고, 일관성을 유지)
    3. 접근 권한 제어
    4. 유지보수에 용이
<br>

    2.
    모놀리틱 아키텍쳐: UI, 비즈니스 로직, DB를 하나의 패키지에 담아 build, 배포
    - 하나로 build 및 배포하므로 기능 간 결합도가 높다. 
    MSA: 하나의 큰 APP을 여러 개의 작은 Application으로 만든 아키텍쳐
    - 기능을 서비스 단위로 분리하므로 큰 단위의 서비스를 운영하기 좋다.
    최근에는 모듈러 모놀리식 (모듈 분리, 배포 통일) 방식도 사용됨
<br>    
        
    + 2-1. UI 패턴
    1. MVC: Model(Data, 비즈니스 로직) View(화면) Controller(req 처리, m 업데이트, v 선택)
            ㄴ 웹 프레임워크의 기본 구조, Controller가 무거워짐
    2. MVP: Model(Data) View(UI) Presenter(v와 m의 중개, 모든 로직)
            ㄴ 테스트 용이, Presenter가 무거워짐

    + 2-2. Layered Architecture
    Presentation Layer (Controller)
    Service Layer (Business Logic)
    Repository Layer (DB 접근)
    Database            
<br>

    3. Snapshot (DDD ...)
    비즈니스 도메인을 중심으로 소프트웨어를 설계하는 방법론
    OrderService에서 로직을 수행할 때, productRepository를 직접 참조하면
    product가 업데이트되었을 때, Order도 영향을 받는다.
    다만, 사용자가 이미 주문한 상품의 가격이 변동되면 안 될 때는
    Snapshot하여 사용하는 것이 좋다.
<br>

    4. Java 접근 권한
    Public: 모두 접근 가능
    Protected: 동일 패키지 or 상속인 다른 패키지가 접근 가능
    Default: 동일 패키지만 접근 가능
    Private: 동일 클래스만 접근 가능

    보통 field는 private,
    내부 동작 method는 protected or private,
    s/getter, method, 생성자는 public or default.
<br>

## 결론

    기초 개념을 많이 빼먹고 있음을 실감,  
    복습을 더 철저히 해야겠다.  
    특히 시스템 작동 방식과 주체를 명확히 알고 쓸 수 있도록  
    -> 효율적으로 학습하자!

    


<br><br>

---

## 과제 2: To Be Continued...

