// https://nuxt.com/docs/api/configuration/nuxt-config

import tailwindcss from "@tailwindcss/vite";
import type { MetaObject } from "nuxt/schema";

const metaObject: MetaObject = {
  title: 'คณะเทคโนโลยีสารสนเทศ',
  titleTemplate: '%s | มหาวิทยาลัยราชภัฏเพชรบุรี',
  templateParams: {
    site: 'คณะเทคโนโลยีสารสนเทศ มรภ.เพชรบุรี'
  },
  htmlAttrs: {
    lang: 'th',
  },
  link: [
    { rel: 'icon', type: 'image/jpeg', href: '/images/IT.jpg' }
  ],
  meta: [
    { name: 'description', content: 'คณะเทคโนโลยีสารสนเทศ มหาวิทยาลัยราชภัฏเพชรบุรี มีสาขาวิชา วิทยาการคอมพิวเตอร์ เทคโนโลยีสารสนเทศ และ คอมพิวเตอร์ (ค.บ)' },
    { name: 'keywords', content: 'วิทยาการคอมพิวเตอร์, เทคโนโลยีสารสนเทศ, คอมพิวเตอร์ศึกษา, มหาวิทยาลัยราชภัฏเพชรบุรี, IT, PBRU' },
    { name: 'author', content: 'Faculty of Information Technology, Phetchaburi Rajabhat University' },

    // Open Graph
    { property: 'og:title', content: 'คณะเทคโนโลยีสารสนเทศ | มรภ.เพชรบุรี' },
    { property: 'og:description', content: 'สาขาหลัก: วิทยาการคอมพิวเตอร์ เทคโนโลยีสารสนเทศ คอมพิวเตอร์ (ค.บ)' },
    { property: 'og:type', content: 'website' },
    { property: 'og:url', content: 'https://www.pbru.ac.th/it' },
    { property: 'og:image', content: '/images/IT.jpg' },

    // Twitter Card
    { name: 'twitter:card', content: 'summary_large_image' },
    { name: 'twitter:title', content: 'คณะเทคโนโลยีสารสนเทศ | มรภ.เพชรบุรี' },
    { name: 'twitter:description', content: 'เรียน IT วิทยาการคอมพิวเตอร์ คอมพิวเตอร์ศึกษา ที่ มหาวิทยาลัยราชภัฏเพชรบุรี' },
    { name: 'twitter:image', content: '/images/IT.jpg' }
  ]
}

export default defineNuxtConfig({
  compatibilityDate: '2025-07-15',
  devtools: { enabled: true },

  css: ['~/assets/css/main.css'],
  vite: {
    plugins: [
      tailwindcss(),
    ],
  },

  modules: [
    '@nuxt/eslint',
    '@nuxt/image',
    '@nuxt/scripts',
    '@nuxt/test-utils',
    '@nuxt/ui',
    '@pinia/nuxt',
  ],

  app: {
    pageTransition: { name: 'page', mode: 'out-in' },
    head: metaObject
  },

  fonts: {
    families: [
      {
        name: 'Noto Sans Thai', provider: 'google'
      }
    ]
  },

})