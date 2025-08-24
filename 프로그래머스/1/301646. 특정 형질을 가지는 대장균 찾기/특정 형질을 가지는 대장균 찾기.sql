-- 코드를 작성해주세요
-- 개체의 형실 = GENOTYPE 
-- 이게 2번은 아니면서 1번 또는 3번의 형질 이어야한다? -> != 2 =1 or =3 이건가?

SELECT COUNT(*) AS COUNT
FROM ECOLI_DATA 
WHERE 1=1
    AND GENOTYPE & 2 = 0
    AND (GENOTYPE & 1 = 1 OR GENOTYPE & 4 = 4);
