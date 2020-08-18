select item, SUM * RATE from SALES s
inner join CURRENCY_RATES c
where s.CURRENCY=c.CURRENCY and (c.CURRENCY, c.RATE_DATE) in (
 select CURRENCY, max(RATE_DATE) from CURRENCY_RATES group by CURRENCY
);