public static void main(String[] args) 
// throws IOException 
{
	LocalDate start = LocalDate.now();
LocalDate end = LocalDate.now().plusMonths(1).with(TemporalAdjusters.lastDayOfMonth());
List<LocalDate> dates = Stream.iterate(start, date -> date.plusDays(1))
                        .limit(ChronoUnit.DAYS.between(start, end))
                        .collect(Collectors.toList());
 
// Get Min or Max Date
LocalDate maxDate = dates.stream().max( Comparator.comparing( LocalDate::toEpochDay ) ).get();
LocalDate minDate = dates.stream().min( Comparator.comparing( LocalDate::toEpochDay ) ).get();
 
System.out.println("maxDate = " + maxDate);
System.out.println("minDate = " + minDate);
 
/*Output:
 
maxDate = 2017-10-30
minDate = 2017-09-13
*/
}
