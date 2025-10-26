import routes from './routes/routes.js';
import { getActiveRoute } from './routes/url-parser.js';
 
const content = document.querySelector('#content');
 
document.addEventListener('DOMContentLoaded', async () => {
  const routeName = getActiveRoute();
  const route = routes[routeName];
 
  const page = route();
  content.innerHTML = await page.render();
});
 
window.addEventListener('hashchange', async () => {
  const routeName = getActiveRoute();
  const route = routes[routeName];
 
  const page = route();
  content.innerHTML = await page.render();
});