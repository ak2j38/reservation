## API 명세서

- 고민들
  - concerts 앞에 reservation을 붙여야하는가?
    - 현재 프로젝트 네임이 reservation긴 하다
  - 콘서트 내부에 날짜를 관리?
    - 매진될 때마다 콘서트 메인테이블을 수정해야함
  - seat는 어떻게 관리해야하지?
    - 각 콘서트의 각 좌석을 DB에 관리하면 데이터가 너무 많아질 것 같은데?
    - 이 고민의 결과에 따라 좌석 예약 시 좌석Id, 좌석No가 정해짐
  - 작업 가능한 유저는 token으로 받아야하나?
  - 공통 응답 형식
    - ok, data, error
---

### 예약 가능 날짜 조회 API (콘서트 조회)
- GET /api/v1/concerts/{concertId}/dates
- 요청
  - concertId: 콘서트Id
- 응답
  - 200, 400, 401, 403, 500 
  - ConcertResponse
---

### 예약 가능 좌석 API (콘서트 조회)
- GET /api/v1/concerts/{concertId}/seats?date={date}
- 요청
  - concertId: 콘서트Id 
  - date: 조회할 날짜 (YYYY-MM-DD 형식)
- 응답
  - 200, 400, 401, 403, 500 
  - 좌석정보를 List로 만들어서 응답
  - ConcertSeatAvailableResponse
  - ```json
      {
        
      } 
    ```
---

## 좌석 예약 요청 API
- POST /api/v1/concerts/seats
- 요청
  - ConcertSeatReservationRequest
  - ``` json
    {
      "concertId": 1,
      "date": "2025-11-13",
      "seats": [
        {
          "seat
        },
        {
        }
      ],
      "totalPrice": 100000,
      ""
    }
    ```
- 응답
---

## 포인트 충전 / 조회 API

---

## 결제 API

---

## 유저 대기열 토큰 발급 API

---



