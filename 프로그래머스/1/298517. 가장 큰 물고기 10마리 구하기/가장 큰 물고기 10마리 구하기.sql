-- 코드를 작성해주세요
-- 가장 큰 10마리 길이 출력 총 카운트가 10개까지로 하면 될거같은데?
-- 결과 내림차순 order by desc
-- 길이가 같다면 asc 
-- 가장 큰 물고기 길이는 10cm이상. 이하는 없으니까 길이 > 10 


SELECT ID, LENGTH
FROM FISH_INFO
WHERE LENGTH IS NOT NULL
ORDER BY LENGTH DESC, ID ASC
LIMIT 10;
