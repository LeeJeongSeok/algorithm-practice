-- 코드를 입력하세요
-- 진료과가 cs이거나 gs인 의사의 이름, id, 진료과, 고용일자 조회
-- 고용일자 기준으로 내림차순, 만약 같다면 이름을 기준으로 오름차순
SELECT
    dr_name,
    dr_id,
    mcdp_cd,
    DATE_FORMAT(hire_ymd, '%Y-%m-%d') AS hire_ymd
FROM doctor
WHERE mcdp_cd LIKE 'CS'
   OR mcdp_cd LIKE 'GS'
ORDER BY hire_ymd desc, dr_name asc