void main(List<String> args) {
  var bd = DateTime(DateTime.now().year, 1, 16);
  var met = DateTime(2020, 6, 22);
  var prop = DateTime(2020, 11, 17);
  var now = DateTime.now();
  var difference = bd.difference(now);
  if (difference.isNegative) {
    bd = bd.add(Duration(days: 365));
    difference = bd.difference(now);
  }
  print('i: ${difference.inDays} days');
  difference = now.difference(met);
  print('1st: ${difference.inDays} days');
  difference = now.difference(prop);
  print('<3: ${difference.inDays} days');
  // print date in format: 18 January 2020
  // now = DateTime.now();
  String months = 'January February March April May June July August September October November December';
  List<String> monthsList = months.split(' ');  
  print('${now.day} ${monthsList[now.month - 1]} ${now.year}');
}
